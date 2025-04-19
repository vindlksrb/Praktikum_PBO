package library.model;

public class Member {
    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void displayInfo() {
        System.out.println("Nama Anggota : " + name);
        System.out.println("ID Anggota   : " + memberId);
        System.out.println("------------------------------");
    }
}
