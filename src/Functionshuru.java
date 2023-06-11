class Functionshuru {
    private String name;
    private String contact;
    private String location;
    private String issue;
    private int age;
    private int id;
    private String password;

    public Functionshuru(String name, String contact, String location, String issue, String pass,  int age, int id) {
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.issue = issue;
        this.password = pass;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setPass(String a) {
    	this.password=a;
    }
    
    public String getPass() {
    	return password;
    }
}


