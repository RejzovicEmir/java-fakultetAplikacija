class Student {
    private String ime;
    private String prezime;
    private String brojIndeksa;

    public Student(String ime, String prezime, String brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    public String getInformacijeOStudentu() {
        return "Ime:" + ime + "," + " Prezime:"  + prezime + "," + " Broj indeksa:" + brojIndeksa;
    }
}