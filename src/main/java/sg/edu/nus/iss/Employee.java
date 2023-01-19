package sg.edu.nus.iss;

public class Employee implements Comparable<Employee>{
    private String staffNo;
    private String fullName;
    private String department;
    private String role;
    private String emailAddress;
    private String slaray;
    
    public Employee(String staffNo, String fullNmae, String department, String role, String emailAddress,
            String slaray) {
        this.staffNo = staffNo;
        this.fullName = fullNmae;
        this.department = department;
        this.role = role;
        this.emailAddress = emailAddress;
        this.slaray = slaray;
    }
    public String getStaffNo() {
        return staffNo;
    }
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getSlaray() {
        return slaray;
    }
    public void setSlaray(String slaray) {
        this.slaray = slaray;
    }


    @Override
    public String toString() {
        return "Employee [staffNo=" + staffNo + ", fullNmae=" + fullName + ", department=" + department + ", role="
                + role + ", emailAddress=" + emailAddress + ", slaray=" + slaray + "]";
    }


    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        return this.getFullName().compareTo(o.getFullName());
        
    }




    


    
    
}
