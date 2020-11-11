package providers;

public class EmployeesStringsProvider {


    /**
     * Returns the string in the text field
     * @param name of the person
     * @param city the person is from
     * @return Full String
     */
    public static String getResponse(String name, String city) {
        return name + " is from " + city;
    }
}
