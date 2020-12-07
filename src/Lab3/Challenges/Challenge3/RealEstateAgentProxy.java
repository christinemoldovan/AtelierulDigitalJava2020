package Lab3.Challenges.Challenge3;

public class RealEstateAgentProxy implements RealEstateAgentInterface {
    private Apartment app;

    @Override
    public void represent(Apartment apartment) {
        app=apartment;
    }

    @Override
    public Apartment rent(Student student) {
        if(student.getName().startsWith("P")){
         return null;
        } else if(student.getMoney()>app.getMonthlyRentCost()){
            return app;
        } else return null;

    }
}
