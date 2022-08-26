public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surename = "Сергеевич";
        post.patronymic = "Петров";
        post.phone = "+7 (916) 123-45-67";
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1983;
        post.passport = "4506 №456765";
    }
}