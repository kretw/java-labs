package task2;

public class SotrudnikPoKontraktu extends Sotrudnik {
    public SotrudnikPoKontraktu(String fio, String position, double oklad) throws OkladException {
        super(fio, position, oklad);
    }

    @Override
    public double calculateSalary() {
        try {
            return getOklad();
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты: " + e.getMessage());
            return getOklad();
        }
    }
}
