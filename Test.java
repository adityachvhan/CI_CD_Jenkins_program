import java.util.Date;

public class Test {
    
    private String projectName;
    private String author;

    // Constructor
    public Test(String projectName, String author) {
        this.projectName = projectName;
        this.author = author;
    }

    // Getter for projectName
    public String getProjectName() {
        return projectName;
    }

    // Custom display method to show project details
    public void displayProjectDetails() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Author: " + author);
        System.out.println("Date: " + new Date());
        System.out.println("Status: In Development");
        System.out.println("Company: AST LLC Corporation, Pune");
        System.out.println("Added this testing project to GitHub");
    }

    public static void main(String[] args) {
        // Create an instance using the constructor
        Test testProject = new Test("Jenkins Testing Project with CI/CD", "Aditya Chavhan");

        // Print initial statements
        System.out.println("This is a Jenkins testing project with CI/CD.");
        System.out.println("This testing is under development.");
        System.out.println("Publisher: adityachavhan@astcorporation.com");

        // Display project details using custom method
        testProject.displayProjectDetails();
    }
}
