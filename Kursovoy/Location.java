package Kursovoy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Location {

    private String title;

    public Location(String title) {
        this.title = title;
    }


    public boolean seach() {  //проверка города по списку
        List<Location> locations = new ArrayList<>();
//список городов Украины, позже занесу в файл
        String s0 = "Авдеевка Акимовка Александрия Александровка Александровка Алупка Алушта Алчевск Амвросиевка Антрацит Апостолово Арбузинка Армянск Артемовск Арциз Ахтырка Балаклея Балта Бар Барановка Барвенково Барышевка Бахмач Бахчисарай Баштанка Белая Церковь Белгород-Днестровский Беловодск Белогорск Белогорье Белозерка Белополье Беляевка Бердичев Бердянск Берегово Бережаны Березанка Березино Березовка Берислав Бершадь Близнюки Бобринец Бобровица Богодухов Богуслав Болград Болехов Борзна Борислав Борисполь Боровая Бородянка Борщев Боярка Бровары Броды Брусилов Брянка Бузуков Бурштын Бурынь Буск Бучач В Валки Варва Васильевка Васильков Васильковка Великая Белозерка Великая Новоселка Верхнеднепровск Верхов Верховина Веселиново Веселое Вижница Винница Виноградов Виньковцы Вишневое Владимир-Волынский Владимирец Вознесенск Волноваха Воловец Володарка Володарское Волочиск Волчанск Вольногорск Вольнянск Врадиевка Высокополье Вышгород Г Гадяч Гайворон Гайсин Галич Гаспра Геническ Герца Глеваха Глобино Глухов Глыбокая Голая Пристань Голованевск Горловка Горностаевка Городенка Городище Городня Городок Горохов Гоща Гребенка Гуляйполе Гурзуф Гусятин Д Двуречная Дебальцево Демидовка Деражня Дергачи Джанкой Дзержинск Диканька Днепродзержинск Днепропетровск Днепрорудное Доброполье Добрянка Докучаевск Долина Долинская Доманевка Донецк Драбов Дрогобыч Дружковка Дубно Дубровица Дунаевцы Е Евпатория Еланец Емильчино Енакиево Ж Жашков Желтые Воды Жидачев Житомир Жмеринка Жолква З Залещики Запорожье Заречное Заставна Зачепиловка Збараж Зборов Звенигородка Згуровка Здолбунов Зеньков Змиев Знаменка Золотоноша Золочев И Ивано-Франковск Ивановка Иванычи Измаил Изюм Изяслав Илларионово Ильинцы Ильичевск Ирпень Иршава Ичня К Кагарлык Казанка Казатин Каланчак Калиновка Калуш Каменец-Подольский Каменка Каменка-Бугская Каменка-Днепровская Камень-Каширский Канев Карловка Катеринополь Каховка Кегичевка Кельменцы Керчь Киверцы Киев Килия Кировоград Кировск Кировское Кицмань Кобеляки Ковель Кодыма Козелец Козельщина Козова Козятин Коломак Коломыя Компанеевка Комсомольск Конотоп Константиновка Кореиз Корец Короп Коростень Коростышев Корсунь-Шевченковский Корюковка Косов Костополь Котельва Котовск Краматорск Красилов Красноармейск Красноград Краснодон Краснокутск Красноперекопск Краснополье Красные Окны Красный Лиман Красный Луч Кременчуг Кривой Рог Куйбышево Кулиничи Купянск Л Ладыжин Лисичанск Лозовая Лопатин Лохвица Лубны Луганск Луцк Львов Люботин М Макеевка Мангуш Марганец Мариуполь Марьинка Мелитополь Мена Мерефа Миргород Михайловка Млинов Могилев-Подольский Молодецкое Монастыриска Монастырище Моршин Мостиска Мукачево Мурованые Куриловцы Н Народичи Недригайлов Нежин Немиров Нетишин Нижние Серогозы Николаев Никополь Новая Каховка Новая Одесса Новая Ушица Новгород-Северский Новгородка Новоазовск Новоайдар Новоархангельск Нововолынск Нововоронцовка Новоград-Волынский Новоднестровск Новомиргород Новомосковск Новопсков Новоселица Новотроицкое Новоукраинка Новояворовск Новые Санжары Новый Буг Носовка О Обухов Овидиополь Овруч Одесса Онуфриевка Оратов Орджоникидзе Орехов Оржица Острог Очаков П Павлоград Первомайск Первомайск Первомайский Первомайское Перевальск Перемышляны Перечин Переяслав-Хмельницкий Першотравенск Першотравенск Петрово Петропавловка Печенеги Пирятин Погребище Подволочиск Подгайцы Полесское Пологи Полонное Полтава Попасная Попельня Приазовское Прилуки Приморск Пустомыты Путивль Путила Пятихатки Р Радехов Радомышль Радывылив Раздельная Раздольное Ракитное Ратнов Рахов Репки Решетиловка Ровеньки Ровно Рогатин Рожище Рожнятов Розовка Романов Ромны Рубежное Ружин С Саврань Садовое Саки Самбор Сарата Сарны Сахновщина Свалява Сватово Свердловск Светловодск Севастополь Северодонецк Селидово Семеновка Семеновка Середина-Буда Симферополь Синельниково Скадовск Сквира Сколе Славута Славутич Славяносербск Славянск Смела Снежное Снигиревка Снятин Сокаль Сокиряны Соленое Сосница Сосновка Софиевка Ставище Старая Выжевка Старая Синява Старобельск Старобешево Старое село Староконстантинов Старый Самбор Стаханов Сторожинец Стрый Судак Сумы Счастье Т Талалаевка Тальное Тараща Тарутино Татарбунары Тельманово Теофиполь Теплик Теребовля Терновка Тернополь Тетиев Тлумач Токмак Томаковка Томашполь Торез Троицкое Тростянец Трускавец Тульчин Турийск Турка Тячев У Ужгород Украинка Ульяновка Умань Устиновка Ф Фастов Феодосия Фрунзовка Х Харцызск Харьков Херсон Хмельник Хмельницкий Хорол Хотин Христиновка Хуст Ц Царичанка Цюрупинск Ч Чаплинка Чемеровцы Червоноармейск Червоноград Черкассы Черневцы Чернигов Черниговка Черновцы Черногородка Черняхов Чортков Чугуев Чутово Ш Шаргород Шахтерск Шацк Шепетовка Широкое Ширяево Шишаки Шостка Шпола Шумск Щ Щорс Э Энергодар Ю Южноукраинск Южный Яворов Яготин Ялта Ямполь Яремча Ярмолинцы Ясиноватая";
        String[] ss;
        ss = s0.split(" ");

        for (String s1 : ss) {
            if (s1.length() > 2) {
                locations.add(new Location(s1));
            }
        }

        int counter = 0;
        for (Location location : locations) {
            if (title.equals(location.toString())) {
                counter++;
                break;
            }
        }
        if (counter == 1) {
            return true;
        } else {
            return false;
        }
    }

    //проверка на правильное введения города
    public Location patLocal() throws IllegalArgumentException {
        Pattern pattern = Pattern.compile("^[А-Яа-яA-Za-z]{2,}$");
        Matcher m = pattern.matcher(title);
        if (!m.matches()) {
            throw new IllegalArgumentException("Incorrect name location");
        }
        if (seach()) {
            return new Location(title);
        } else {
            throw new IllegalArgumentException("No mach!");
        }

    }

    @Override
    public String toString() {
        return title;
    }
}