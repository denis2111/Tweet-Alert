from googletrans import Translator as GoogleTranslator


class Translator:
    # region Singleton
    __instance = None

    @staticmethod
    def get_instance():
        if Translator.__instance is None:
            Translator()
        return Translator.__instance

    def __init__(self):
        self.gt_instance = GoogleTranslator()
        if Translator.__instance is not None:
            raise Exception("Singleton Class")
        else:
            Translator.__instance = self

    # endregion

    def text_language(self, text: str) -> str:
        data = self.gt_instance.detect(text)
        return data.lang

    def get_en_translation(self, text: str) -> str:
        if Translator.__instance.text_language(text) != 'en':
            translated_text = self.gt_instance.translate(text, dest='en').text
        else:
            translated_text = text
        return translated_text


if __name__ == '__main__':
    local_text = 'Der Himmel ist blau und ich mag einen Apfel'
    print(f'Text lg: {Translator.get_instance().text_language(local_text)}')
    print(f'EN Translated txt: {Translator.get_instance().get_en_translation(local_text)}')
    print("assaas".split(" "))