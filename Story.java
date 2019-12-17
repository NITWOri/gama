public class Story {

        private Situation start_story;
        public Situation current_situation;

        Story() {
            start_story = new Situation(
                    "Пробуждение",
                    "Ты просыпаешься в очень тёмной и холодной комнате комнате. Ты очень хочешь выбраться отсюда?\n"
                            + "Осмотреться \n"
                            + "Позвать на помощь \n"
                            + "Пошарить по карманам",
                    3);

            start_story.direction[0] = new Situation(
                    "Дурак",
                    "Ты глупенький? Тебе же сказали, что в комнате темно, как ты собрался осматриваться? \n"
                            + "Ощупать комнату \n"
                            + "Позвать на помощь \n"
                            + "Пошарить по карманам",
                    3);

            start_story.direction[1] = new Situation(
                    "Молчание",
                    "Ты поорал и продолжил сидеть на холодном полу. Может сделаем что-нибудь? \n"
                            + "Осмотреться \n"
                            + "Помолиться \n"
                            + "Пошарить по карманам",
                    3);

            start_story.direction[2] = new Situation(
                    "Мобила",
                    "Ты нашёл телефон и ручку от Тинькоффа. На телефоне достаточно зарядки только на что-то одно. Что будем делать? \n"
                            + "Позвонить в полицию \n"
                            + "Посмотреть ленту ВК \n"
                            + "Поиграть в 'змейку'",
                    3);

            start_story.direction[0].direction[0] = new Situation(
                    "Дверь",
                    "Ты нащупал закрытую дверь, но она, кажется, еле держится на петлях \n"
                            + "This is Sparta! \n"
                            + "Пробить дверь головой",
                    2);

            start_story.direction[0].direction[1] = start_story.direction[1];

            start_story.direction[0].direction[2] = start_story.direction[2];

            start_story.direction[1].direction[0] = start_story.direction[0];

            start_story.direction[1].direction[1] = new Situation(
                    "Нисхождение",
                    "Ты помолился и вдруг яркий свет озарил комнату. Появилась надпись:'Ждите в течение 2 тысяч лет'.\n"
                            + "Ждать 2 тысячи лет \n"
                            + "Пошарить по карманам"
                            + "Ощупать комнату",
                    3);

            start_story.direction[1].direction[2] = start_story.direction[2];

            start_story.direction[2].direction[0] = new Situation(
                    "Алё?",
                    "Тебе ответила девушка с приятным голосом. 'Я вас слушаю', - сказала она\n"
                            + "Девушка, выходите за меня! \n"
                            + "Помогите мне, я в тёмной комнате! \n"
                            + "Если вы не передадите мне 1 000 000 долларов, то я кину в вас стаканчиком",
                    3);

            start_story.direction[2].direction[1] = new Situation(
                    "ВК",
                    "В ленте не было ни одного годного мема, но зато ты упел посраться в комментах\n"
                            + "Заняться самокопанием\n"
                            + "Съесть телефон\n"
                            + "Ощупать комнату",
                    3);

            start_story.direction[2].direction[2] = new Situation(
                    "Змейка",
                    "Как только ты запустил игру, в комнату сквозь стены ворвалась огромная змея и съела тебя\n"
                            + "Попал в фильм 'Пиксели'\n",
                    1);

            start_story.direction[0].direction[0].direction[0] = new Situation(
                    "Свобода",
                    "За дверью оказалась твоя комната. Как только ты в неё за шёл дверь за тобой захлопнулась и исчезла\n"
                            + "Выбрался из этой недонедоигры!\n",
                    1);

            start_story.direction[0].direction[0].direction[1] = start_story.direction[0].direction[0].direction[0];

            start_story.direction[1].direction[1].direction[1] = new Situation(
                    "Не дотянул",
                    "Ты бы подождал и дольше, если бы не умер от голода.\n"
                            + "Умер, так и не дождавшись чуда\n",
                    1);

            start_story.direction[1].direction[1].direction[1] = start_story.direction[2];

            start_story.direction[1].direction[1].direction[2] = start_story.direction[0].direction[0];

            start_story.direction[2].direction[0].direction[0] = new Situation(
                    "Отказ",
                    "'Очень смешно', - сказала девушка и повесила трубку. Ты разочаровался в себе и в своих способностях к подкатыванию к девушкам. А ещё ты умер от тоски\n"
                            +"Грустная концовка",
                    1);

            start_story.direction[2].direction[0].direction[1] = new Situation(
                    "Что?",
                    "'Ой какой неженка, чуть что сразу в полицию звонит. Что сам не можешь разобраться со своими проблемами? Вот мой отец....' - она продолжала и продолжала" +
                            "но конца этой истории ты никогда не услышишь т.к. ты умер от словесного передоза. \n"
                            + "Девушки... могут заговорить каждого до смерти",
                    1);

            start_story.direction[2].direction[0].direction[2] = new Situation(
                    "Спецназ",
                    "В этот самый момент как ты сказал это стены пробили доблестные спецназовцы и спасли тебя А может и не совсем спасли"
                    + "Заагрил на себя полицию",
                    1);

            start_story.direction[2].direction[1].direction[0] = new Situation(
                    "Грустно",
                    "Ты начал размышлять о то, что было в твоей жизни и в этот самый момент ты вспомнил все самые неудачные моменты в своей жизни и в конце в концов умер от печали"
                            + "Осторожно дети! Самокопание - это не игрушка",
                    1);

            start_story.direction[2].direction[1].direction[1] = new Situation(
                    "Минздрав предупреждает",
                    "Ты съел телефон и умер от пищевого отравления. Даже не знаю как так получилось"
                            + "Минздрав предупреждает! Есть телефоны - опасно для вашего здоровья",
                    1);

            start_story.direction[2].direction[1].direction[2] = start_story.direction[0].direction[0];

            current_situation = start_story;
        }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}

