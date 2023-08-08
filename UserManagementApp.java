public class UserManagementApp {
    public static void main(String[] args) {
        // Создаем экземпляры модели, представления и презентера
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter(model, view);

        // Принцип DIP (Принцип инверсии зависимостей):
        // Зависимость от абстракций: Презентер зависит от абстракции (интерфейса) представления и модели.
        // Это позволяет легко заменять конкретные реализации представления и модели, не изменяя презентер.

        // Выполняем вычисления с помощью презентера
        presenter.performCalculation();
    }
}