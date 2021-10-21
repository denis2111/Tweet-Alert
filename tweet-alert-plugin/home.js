let lastScrollPosition = 0;
let STEP = 1000;
let cache = new Map();

document.addEventListener('scroll', check);

function check(e)
{
   let scrollPosition = window.scrollY;
   if (Math.abs(lastScrollPosition - scrollPosition) < STEP) return;
   lastScrollPosition = scrollPosition;

   let allArticles = document.getElementsByTagName("article");
   for (let i = 0; i < allArticles.length; i++)
   {
      let article = allArticles[i];
      let textTag = article.querySelector('[lang]');
      let imageTag = article.querySelector('[alt="Image"]');
      let text = "";
      let imgSrc = "";
      if (textTag)
      {
         text = textTag.textContent;
      }
      if (imageTag)
      {
         imgSrc = imageTag.getAttribute("src");
      }
      let prediction = predict(text, imgSrc);
      switch (prediction)
      {
         case 0:
            article.style.border = "thick solid #0000FF"; break;
         case 1:
            article.style.border = "thick solid #00FFFF"; break;
         case 2:
            article.style.border = "thick solid #00FF00"; break;
         case 3:
            article.style.border = "thick solid #FF0000"; break;
      }
   }
}

function predict(text, imgSrc)
{
   let hash = getHash(text, imgSrc);
   if (cache.has(hash)) return cache.get(hash);
   let prediction = Math.floor(Math.random() * 5);
   cache.set(hash, prediction);
   return prediction;
}

function getHash(text, imgSrc)
{
   return getHash((text + "$" + imgSrc));
}

function getHash(str) 
{
   var hash = 0, i, chr;
   if (str.length === 0) return hash;
   for (i = 0; i < str.length; i++) 
   {
     chr   = str.charCodeAt(i);
     hash  = ((hash << 5) - hash) + chr;
     hash |= 0;
   }
   return hash;
 };