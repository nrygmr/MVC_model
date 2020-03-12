
public class PersonalDietaryManger  {
    public static void main(String[] args)
    {
        View mvcView = new View();
        Model mvcModel = new Model();
        Controller mvcController = new Controller(mvcView,mvcModel);
        mvcView.setVisible(true);


    }
}