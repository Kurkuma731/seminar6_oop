public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void performCalculation() {
        // Принцип SRP (Принцип единственной ответственности):
        // Презентер занимается обработкой пользовательского ввода и
        // вызовом модели для выполнения операции.

        // Получаем ввод от пользователя
        double num1 = view.getNumberInput();
        String operator = view.getOperatorInput();
        double num2 = view.getNumberInput();

        try {
            // Выполняем операцию с использованием модели
            double result = model.performOperation(num1, num2, operator);
            
            // Отображаем результат пользователю
            view.displayResult(result);
        } catch (ArithmeticException e) {
            // Обрабатываем ошибку деления на ноль
            System.out.println("Error: " + e.getMessage());
        }
    }
}