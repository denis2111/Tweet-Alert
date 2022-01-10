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
      text = text.replace(/(\r\n|\n|\r)/gm, "");
      text = text.replace(/["]+/g, '')
      predict(text, imgSrc, (result) => {
         switch (result)
         {
            case "DISASTER":
               article.style.border = "thick solid #000000"; break; // negru
            case "CYCLONE":
               article.style.border = "thick solid #888888"; break; // gri
            case "EARTHQUAKE":
               article.style.border = "thick solid #00FF00"; break; // verde
            case "FLOOD":
               article.style.border = "thick solid #0000FF"; break; // albastru
            case "WILDIFRE":
               article.style.border = "thick solid #FF0000"; break; // rosu
         }
      });
   }
}

function predict(text, imgSrc, callback)
{
   let hash = getHash(text, imgSrc);
   if (cache.has(hash)) return cache.get(hash);
   data = {"text" : text, "image": imgSrc};
   console.log(JSON.stringify(data));

   const options = {
      method: 'POST',
      headers:{
          'Access-Control-Allow-Headers': '*',
          'Content-Type': 'application/json'
      },
   };

   options.body = JSON.stringify(data);

   fetch(`http://localhost:8080/api/v1/classify`, options)
   .then(r => r.json())
   .then(result => {
      console.log(result.classificationResponse)
      callback(result.classificationResponse.classificationLabel)
   })
   .catch(error => {
      console.log("eroare: " + JSON.stringify(data))
      console.log(error)
   })
   //let prediction = Math.floor(Math.random() * 5);
   //cache.set(hash, prediction);
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