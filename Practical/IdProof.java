class IdProof {
    int inum;
    String city;
    String state;
    int pincode;
    String dob;

    public IdProof(int inum, String city, String state, int pincode, String dob) {
        this.inum = inum;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.dob = dob;
    }
}

class Student {
    int id;
    String name;
    String emailId;
    long contact;
    IdProof idp; //HAS-A Relationship, gave a reference of IdProof class

    public Student(int id, String name, String emailId, long contact, IdProof idp) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.contact = contact;
        this.idp = idp;
    }

    public void show() {
        System.out.print(id + name + emailId + contact);
        System.out.println(idp.inum + idp.city + idp.state + idp.pincode + idp.dob);
    }

}

class AggregationExample {
    public static void main(String[] args) {
        IdProof i1 = new IdProof(100, "Mumbai", "MH", 400003, "12-01-2000");
        IdProof i2 = new IdProof(101, "Mumbai", "MH", 400703, "14-02-2002");
        IdProof i3 = new IdProof(102, "Mumbai", "MH", 400093, "16-07-2005");
        Student s1 = new Student(1, "Andrew", "andrew@gmail.com", 98772, i1);
        Student s2 = new Student(2, "Louis", "louis@gmail.com", 97652, i2);
        Student s3 = new Student(3, "Harvey", "harvey@gmail.com", 88782, i3);
        s1.show();
        s2.show();
        s3.show();
    }
}