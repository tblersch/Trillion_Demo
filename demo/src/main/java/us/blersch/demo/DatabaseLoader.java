package us.blersch.demo;

import us.blersch.demo.model.Person;
import us.blersch.demo.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final PersonRepository repository;

    @Autowired
    public DatabaseLoader(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Person("5654 Ultrices Avenue","Lansing","MI","68487","Byron Roy"));
        this.repository.save(new Person("P.O. Box 191, 1563 Donec St.","Cambridge","MA","94451","Reece Fuller"));
        this.repository.save(new Person("303 Consequat Rd.","Metairie","LA","75158","Hamish Mccall"));
        this.repository.save(new Person("8033 Odio. Ave","Butte","MT","11802","Warren Bowers"));
        this.repository.save(new Person("6929 Proin St.","Oklahoma City","OK","19820","Abel Sears"));
        this.repository.save(new Person("Ap #398-5117 Metus Rd.","Tampa","FL","80669","Bert Vaughn"));
        this.repository.save(new Person("P.O. Box 724, 7008 Sed St.","Hattiesburg","MS","84898","Bevis Meyers"));
        this.repository.save(new Person("689-7386 Tellus Avenue","Kenosha","WI","45060","Ira Rivera"));
        this.repository.save(new Person("3896 Metus Street","Bloomington","MN","96190","Lane Hensley"));
        this.repository.save(new Person("3735 Mattis. Rd.","Tucson","AZ","86596","Armando Kline"));
        this.repository.save(new Person("Ap #316-9441 Mauris Rd.","Portland","ME","13534","Elmo Mcbride"));
        this.repository.save(new Person("216-598 Vivamus Ave","Bloomington","MN","60994","Barclay Gilliam"));
        this.repository.save(new Person("P.O. Box 963, 1416 Amet Road","Mesa","AZ","86984","Brian Rogers"));
        this.repository.save(new Person("Ap #823-2384 Elit, St.","Oklahoma City","OK","63109","Quamar Buck"));
        this.repository.save(new Person("2358 A Ave","Indianapolis","IN","77688","Berk Glover"));
        this.repository.save(new Person("Ap #484-7536 Vitae Road","Tuscaloosa","AL","36177","Hayes Lawson"));
        this.repository.save(new Person("8505 A Rd.","Biloxi","MS","12603","Zeus Singleton"));
        this.repository.save(new Person("P.O. Box 794, 7593 Vel, Rd.","Des Moines","IA","48703","Alden Gates"));
        this.repository.save(new Person("P.O. Box 637, 6073 Erat Street","Gresham","OR","14498","Malcolm Butler"));
        this.repository.save(new Person("P.O. Box 940, 3995 Metus. St.","Milwaukee","WI","40313","Ezra York"));
        this.repository.save(new Person("820 Mollis St.","Chicago","IL","76586","Scott Kaufman"));
        this.repository.save(new Person("P.O. Box 595, 3786 Dictum Rd.","Cincinnati","OH","24983","Jakeem Decker"));
        this.repository.save(new Person("P.O. Box 799, 3778 Quis Avenue","Bridgeport","CT","44943","Gage Stephens"));
        this.repository.save(new Person("Ap #828-8620 Est, Avenue","Juneau","AK","99853","Isaiah Blackburn"));
        this.repository.save(new Person("P.O. Box 958, 6375 Semper Avenue","Olympia","WA","19645","Chadwick Mccarthy"));
        this.repository.save(new Person("9324 Donec Rd.","Grand Island","NE","78560","Xenos Watts"));
        this.repository.save(new Person("P.O. Box 812, 8600 Nibh. Avenue","Springfield","MO","65741","Ferdinand Osborn"));
        this.repository.save(new Person("P.O. Box 762, 4503 Sit Ave","Honolulu","HI","82986","Micah Newton"));
        this.repository.save(new Person("360-4924 Eros. Avenue","Miami","FL","45974","Octavius Stevenson"));
        this.repository.save(new Person("P.O. Box 201, 8373 Habitant Rd.","Detroit","MI","64226","Emery Curry"));
        this.repository.save(new Person("Ap #261-8971 Nunc Road","Jackson","MS","14814","Keith Bowman"));
        this.repository.save(new Person("Ap #966-9294 Nec, Rd.","San Diego","CA","95526","Nehru Morton"));
        this.repository.save(new Person("Ap #317-6424 Eget Rd.","Glendale","AZ","85873","Garth Greene"));
        this.repository.save(new Person("671 Arcu. Rd.","Atlanta","GA","33582","Phelan Deleon"));
        this.repository.save(new Person("Ap #528-9553 Ac St.","Kansas City","KS","10421","Gil Rodgers"));
        this.repository.save(new Person("P.O. Box 229, 6406 Magna. Rd.","Springfield","MA","45887","Henry Simmons"));
        this.repository.save(new Person("865-4199 Laoreet Rd.","Bloomington","MN","45503","Basil Le"));
        this.repository.save(new Person("P.O. Box 820, 2013 Tempor Av.","Lansing","MI","84610","Vernon Ingram"));
        this.repository.save(new Person("P.O. Box 856, 3099 Integer Street","Phoenix","AZ","86161","August Porter"));
        this.repository.save(new Person("185-3641 Vulputate Rd.","Sterling Heights","MI","52094","Lawrence Armstrong"));
        this.repository.save(new Person("P.O. Box 291, 2756 Consequat, Avenue","Idaho Falls","ID","28635","Richard Chan"));
        this.repository.save(new Person("6237 Placerat, Av.","Auburn","ME","59487","Steven Patel"));
        this.repository.save(new Person("P.O. Box 304, 4615 Rhoncus. Rd.","Hattiesburg","MS","59062","Allen Shannon"));
        this.repository.save(new Person("P.O. Box 111, 1483 Magna. Street","Vancouver","WA","59148","Perry Ward"));
        this.repository.save(new Person("Ap #678-6362 Arcu Rd.","Savannah","GA","94520","Julian Mayer"));
        this.repository.save(new Person("P.O. Box 288, 6361 Enim Av.","South Bend","IN","70175","Alfonso Brady"));
        this.repository.save(new Person("Ap #666-2238 Varius. St.","Covington","KY","43914","Kyle Campos"));
        this.repository.save(new Person("780-3863 Tincidunt St.","Billings","MT","14285","Barry Mosley"));
        this.repository.save(new Person("Ap #473-1539 Elit. Ave","Evansville","IN","92337","Theodore Singleton"));
        this.repository.save(new Person("4575 Montes, Avenue","Sandy","UT","61330","Bruce Scott"));
        this.repository.save(new Person("P.O. Box 299, 4856 Sit Rd.","Rochester","MN","88265","Chase Gardner"));
        this.repository.save(new Person("8353 Aliquet. Av.","Bear","DE","37430","Dalton Burks"));
        this.repository.save(new Person("8183 Laoreet St.","Gulfport","MS","20991","Tiger Graves"));
        this.repository.save(new Person("Ap #695-2606 Ante St.","Baltimore","MD","42328","Kato Burt"));
        this.repository.save(new Person("9179 In Avenue","Columbia","MO","42819","Alden Wilson"));
        this.repository.save(new Person("1123 Magnis St.","Idaho Falls","ID","74570","Oscar Chapman"));
        this.repository.save(new Person("4043 Hendrerit Avenue","Sterling Heights","MI","53811","Paki Madden"));
        this.repository.save(new Person("2634 Tincidunt Road","Austin","TX","28739","Dustin Howard"));
        this.repository.save(new Person("P.O. Box 363, 996 Id, Street","Auburn","ME","19911","Cameron Blankenship"));
        this.repository.save(new Person("7485 Libero Rd.","St. Petersburg","FL","22369","Gabriel Humphrey"));
        this.repository.save(new Person("Ap #633-7007 Non Ave","Chattanooga","TN","89441","Ryder Gaines"));
        this.repository.save(new Person("879-7445 Nibh. Rd.","Atlanta","GA","24205","Neville Whitaker"));
        this.repository.save(new Person("Ap #489-5212 Nonummy Rd.","Denver","CO","25485","Barry Pate"));
        this.repository.save(new Person("P.O. Box 382, 9344 Amet Road","Los Angeles","CA","92157","Raja Guzman"));
        this.repository.save(new Person("922-7578 Tempor St.","Oklahoma City","OK","55849","Caesar Wiggins"));
        this.repository.save(new Person("Ap #904-6784 Sed Rd.","Philadelphia","PA","77846","Harrison Espinoza"));
        this.repository.save(new Person("4736 Quisque Road","Chicago","IL","59912","Coby Barton"));
        this.repository.save(new Person("3613 Mollis Rd.","Bellevue","NE","94156","Cody Reed"));
        this.repository.save(new Person("5308 Urna Ave","Huntsville","AL","35717","Ralph May"));
        this.repository.save(new Person("3811 Cursus Rd.","Rockford","IL","82460","Basil Hartman"));
        this.repository.save(new Person("9731 Dolor, Road","Jackson","MS","71871","Ali Huffman"));
        this.repository.save(new Person("P.O. Box 969, 4462 Sem, Rd.","Bangor","ME","94021","Oren Santiago"));
        this.repository.save(new Person("Ap #279-6467 Scelerisque Av.","Nashville","TN","58592","Carlos Murphy"));
        this.repository.save(new Person("673-3018 Vitae, St.","Laramie","WY","90584","Ali Molina"));
        this.repository.save(new Person("8330 Ornare. Street","Salem","OR","93369","Bruce Santana"));
        this.repository.save(new Person("367-6177 A St.","Pocatello","ID","35845","Timothy Page"));
        this.repository.save(new Person("9905 Nullam Street","Rutland","VT","39588","Andrew Barrett"));
        this.repository.save(new Person("P.O. Box 843, 5550 Dapibus Road","Sioux City","IA","47906","Myles Gray"));
        this.repository.save(new Person("P.O. Box 644, 2789 Pellentesque, Road","Tallahassee","FL","20045","Brian Beard"));
        this.repository.save(new Person("Ap #625-9993 Egestas St.","New Orleans","LA","80048","Philip Rowe"));
        this.repository.save(new Person("Ap #184-9420 Molestie St.","Lafayette","LA","54759","Stewart Forbes"));
        this.repository.save(new Person("7445 In Street","South Burlington","VT","99580","Emerson Bowers"));
        this.repository.save(new Person("P.O. Box 140, 9168 Risus. Street","Topeka","KS","34536","Elijah Petersen"));
        this.repository.save(new Person("P.O. Box 424, 2207 Non, Ave","Juneau","AK","99760","Jordan Cole"));
        this.repository.save(new Person("101-9959 Dis St.","Duluth","MN","61854","Caleb Walter"));
        this.repository.save(new Person("1455 Mollis. Ave","Fresno","CA","96430","Kato Mcdonald"));
        this.repository.save(new Person("6754 Elit Street","Fresno","CA","95722","Eric Diaz"));
        this.repository.save(new Person("6393 Auctor Street","Hattiesburg","MS","46280","Cade Castillo"));
        this.repository.save(new Person("1110 Urna. St.","Worcester","MA","97764","Addison Shelton"));
        this.repository.save(new Person("P.O. Box 732, 1462 Mollis. Ave","Rochester","MN","51883","Brent Owens"));
        this.repository.save(new Person("9303 Lacus. Rd.","Sioux City","IA","97151","Curran Perez"));
        this.repository.save(new Person("P.O. Box 317, 6939 Ullamcorper Rd.","Gary","IN","79699","Connor Holder"));
        this.repository.save(new Person("7887 Luctus Avenue","Iowa City","IA","25220","Shad Baird"));
        this.repository.save(new Person("P.O. Box 895, 5801 Quam Ave","Anchorage","AK","99663","Caleb Wright"));
        this.repository.save(new Person("P.O. Box 631, 6827 Ultricies Avenue","Chattanooga","TN","67665","Calvin Harrington"));
        this.repository.save(new Person("799-4104 Volutpat. Avenue","Erie","PA","31022","Jermaine Hurst"));
        this.repository.save(new Person("7809 In Ave","Saint Louis","MO","19312","Barry Flynn"));
        this.repository.save(new Person("Ap #755-1122 Ante. St.","Des Moines","IA","55965","Austin Gutierrez"));
        this.repository.save(new Person("Ap #694-5035 Turpis. Ave","Sioux City","IA","33151","Ray Mack"));
        this.repository.save(new Person("Ap #759-2978 Dapibus Ave","Las Vegas","NV","41212","Elton Franco"));
    }
}
