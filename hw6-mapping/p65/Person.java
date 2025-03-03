package p65;

/**
 * author: fv1230
 */
public abstract class Person {
    private String name;
    private String address;
    private int socialSecurityNumber;

    private Set<Company> employers;
    private Set<Salary> salaries;


    public Person(String name, String address, int socialSecurityNumber, Set<Company> companies) {
        this.name = name;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
        this.companies = companies;
    }

    // Company getter and setter
    public Set<Company> getCompanies() {
        return this.companies;
    }

    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }

    public void addCompany(Company company) {
        this.companies.add(company);
    }

    public void removeCompany(Company company) {
        this.companies.remove(company);
    }

    // Salary getter and setter
    public void addSalary(Salary salary) {
        this.salaries.add(salary);
    }

    public void removeSalary(Salary salary) {
        this.salaries.remove(salary);
    }

    public Set<Salary> getSalaries() {
        return this.salaries;
    }

    
    /**
     * REDUNDANT CODE
     */
    // Name getter and setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Address getter and setter
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Social security number getter
    public int getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }
}