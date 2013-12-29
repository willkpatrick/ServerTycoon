import java.util.ArrayList;

public class Company {
    private String companyName;
    private int capital;
    private int revenue;
    private int costs;
    private int customers;
    private ArrayList<Server> companyServers = new ArrayList<Server>();


    public int getCapital() {
        return capital;
    }
    public void setCapital(int capital) {
        this.capital = capital;
    }
    public int getRevenue() {
        return revenue;
    }
    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }
    public int getCosts() {
        return costs;
    }
    public void setCosts(int costs) {
        this.costs = costs;
    }
    public int getCustomers() {
        return customers;
    }
    public void setCustomers(int customers) {
        this.customers = customers;
    }
    public void listCompanysServers() {
        for (int i = 0; i < companyServers.size(); i++) {
            System.out.println(companyServers.get(i).toString());
        }
    }
    public void addServerToCompany(int serverNumber) {
        this.companyServers.add(new Server(serverNumber));
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Company(String companyName) {
        this.companyName = companyName;
        this.capital = 100000;
        this.revenue = 0;
        this.costs = 0;
    }



}
