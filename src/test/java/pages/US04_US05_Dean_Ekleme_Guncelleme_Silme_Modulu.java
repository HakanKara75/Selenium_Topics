package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US04_US05_Dean_Ekleme_Guncelleme_Silme_Modulu {
    public US04_US05_Dean_Ekleme_Guncelleme_Silme_Modulu() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[3]")
    public WebElement deanList;
    @FindBy(xpath = "(//h5[@class='fw-bold p-3 card-header'])[2]")
    public WebElement deanListBasligi;
    @FindBy(xpath = "//th[text()='Name']")
    public WebElement nameSutunu;
    @FindBy(xpath = "//th[text()='Gender']")
    public WebElement genderSutunu;
    @FindBy(xpath = "//th[text()='Phone Number']")
    public WebElement phoneNumberSutunu;
    @FindBy(xpath = "//th[text()='Ssn']")
    public WebElement ssnSutunu;
    @FindBy(xpath = "//th[text()='User Name']")
    public WebElement usernameSutunu;
    @FindBy(xpath = "//div[@class='mb-5 ms-3 me-3 text-center border border-3 shadow-sm bg-body rounded card border-warning']")
    public WebElement deanListBolumu;

    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header']")
    public WebElement deanManagementBolumu;
    @FindBy(xpath = "//div[@class='mt-5 ms-3 me-3 mb-5 text-center border border-3 shadow-sm bg-body rounded card border-warning']")
    public WebElement addDeanClass;


    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;
    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surname;
    @FindBy(xpath = "(//a[@role='button'])[10]")
    public WebElement adminManagement;
    @FindBy(xpath = "//a[text()='Dean Management']")
    public WebElement deanManagement;
    @FindBy(xpath = "(//a[@role='button'])[12]")
    public WebElement viceDeanManagement;
    @FindBy(xpath = "(//a[@role='button'])[13]")
    public WebElement lessonManagement;
    @FindBy(xpath = "(//a[@role='button'])[14]")
    public WebElement teacherManagement;
    @FindBy(xpath = "(//a[@role='button'])[15]")
    public WebElement studentManagement;
    @FindBy(xpath = "(//a[@role='button'])[16]")
    public WebElement studentInfoManagement;
    @FindBy(xpath = "(//a[@role='button'])[17]")
    public WebElement meetManagement;
    @FindBy(xpath = "(//a[@role='button'])[18]")
    public WebElement chooseLessonMenu;
    @FindBy(xpath = "(//a[@role='button'])[19]")
    public WebElement contactGetAll;
    @FindBy(xpath = "(//a[@role='button'])[20]")
    public WebElement getUser;
    @FindBy(xpath = "(//a[@role='button'])[21]")
    public WebElement logOut;
    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlace;
    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement female;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male;
    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement dateOfBirth;
    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submit;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
    public WebElement chooseLessonTextBox;
    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement editName;
    @FindBy(xpath = "(//input[@id='surname'])[2]")
    public WebElement editSurname;
    @FindBy(xpath = "(//input[@id='birthPlace'])[2]")
    public WebElement editBirthPlace;
    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement editEmail;
    @FindBy(xpath = "(//input[@id='phoneNumber'])[2]")
    public WebElement editPhone;
    @FindBy(xpath = "(//input[@id='ssn'])[2]")
    public WebElement editSsn;
    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/input[1]")
    public WebElement isAdvisorTeacher;

    @FindBy(xpath = "(//input[@value='FEMALE'])[2]")
    public WebElement editGenderFemale;
    @FindBy(xpath = "(//input[@value='MALE'])[2]")
    public WebElement editGenderMale;
    @FindBy(xpath = "(//input[@id='birthDay'])[2]")
    public WebElement editDateOfBirth;
    @FindBy(xpath = "(//input[@id='username'])[2]")
    public WebElement editUserName;
    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement editPassword;
    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement editSubmit;
    @FindBy(xpath = "(//button[@type='button'])[7]")
    public WebElement firstEditButton;

    @FindBy(xpath = "//div[@class='text-center modal-title h4']")
    public WebElement editDeanBolumBasligi;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement addName;
    @FindBy(xpath = "//input[@id='surname']")
    public WebElement addSurname;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement requiredMessageName;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement requiredMessageSurname;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement requiredMessageBirthPlace;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement requiredMessageDateOfBirth;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement requiredMessagePhone;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement requiredMessageSsn;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement requiredMessageUserName;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement requiredMessagePassword;
    @FindBy(xpath = "(//div[@class='Toastify__toast-body'])[1]")
    public WebElement alertMessage;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginPasword;
    @FindBy(xpath = "(//div[@class='Toastify__toast-body'])[1]")
    public WebElement nameShouldTwo;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement saveMessage;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement login2;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement login3;
    @FindBy(xpath = "//h3")
    public WebElement StudentManagementInfo;
    @FindBy(xpath = "//span[text()='TeacherKemal']")
    public WebElement teacherName;

    @FindBy(xpath = "(//div[text()='Main Menu'])[2]")
    public WebElement mainMenu;
    @FindBy(xpath = "//h3")
    public WebElement meetManagementText;
    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement chooseStudentBox;

    @FindBy(xpath = "//input[@id='date']")
    public WebElement date;
    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement startTime;
    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stopTime;
    @FindBy(xpath = "//*[@id='description']")
    public WebElement description;


    @FindBy(xpath = "//div[@class=' css-1nmdiq5-menu']")
    public List<WebElement> list;
    @FindBy(xpath = "//div[text()='Kemal ARZU']")
    public WebElement selectedName;
    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement message;
    @FindBy(xpath = "(//h5)[2]")
    public WebElement meetList;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement uyeGirisKismiLoginButton;

    @FindBy(xpath = "//*[@id=\"root\"]//thead/tr/th[1]")
    public WebElement tableDate;
    @FindBy(xpath = "//*[@id=\"root\"]//thead/tr/th[2]")
    public WebElement startTimeTable;
    @FindBy(xpath = "//*[@id=\"root\"]//thead/tr/th[3]")
    public WebElement stopTimeTable;
    @FindBy(xpath = "(//*[@id=\"description\"])[2]")
    public WebElement descriptionTable;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[5]/span/button")
    public WebElement edit;
    @FindBy(xpath = "(//input[@id='date'])[2]")
    public WebElement editDate;
    @FindBy(xpath = "(//input[@id='startTime'])[2]")
    public WebElement editStartTime;
    @FindBy(xpath = "(//input[@id='stopTime'])[2]")
    public WebElement editStopTime;
    @FindBy(xpath = "(//input[@placeholder='Description'])[2]")
    public WebElement editDescription;

    @FindBy(xpath = "(//div[@class=' css-hlgwow'])[2]")
    public WebElement chooseStudentBox2;

    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
    public WebElement hata;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    public WebElement onay;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[4]/span")
    public WebElement silineceMeetinginDescriptionu;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[3]/span")
    public WebElement silinecekMeetinginStopTime;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[2]/span")
    public WebElement silinecekMeetinginStartTime;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[1]/span")
    public WebElement silinecekMeetinginDate;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[6]/span/button")
    public WebElement delete;


    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']")
    public List<WebElement> table;
    @FindBy(xpath = "//tr[td/span[text()='2023-12-12']][td/span[text()='11:00:00']][td/span[text()='13:00:00']][td/span[text()='dersDurumu ']]")
    public WebElement row;
    @FindBy(xpath = "//span[text()='AtabeyArzu']")
    public WebElement studentName;
    @FindBy(xpath = "//h3")
    public WebElement chooseLessonManagement;
    @FindBy(xpath = "//input[@value='4']")
    public WebElement dorduncuDers;
    @FindBy(xpath = "//input[@value='5']")
    public WebElement ders1;
    @FindBy(xpath = "//input[@value='7']")
    public WebElement ders2;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/div/div[1]/table/thead/tr/th[3]")
    public WebElement teacher;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/div/div[1]/table/thead/tr/th[3]//following-sibling::td")
    public List<WebElement> teacherCells;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/div/div[1]/table/thead/tr/th[2]")
    public WebElement lessons;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/div/div[1]/table/thead/tr/th[4]")
    public WebElement day;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/div/div[1]/table/thead/tr/th[5]")
    public WebElement StudentstartTime;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/div/div[1]/table/thead/tr/th[6]")
    public WebElement StudentstopTime;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/div/div[1]/table/thead/tr/th[2]//following-sibling::td")
    public List<WebElement> lessonsCells;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/div/div[1]/table/thead/tr/th[4]//following-sibling::td")
    public List<WebElement> dayCells;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/div/div[1]/table/thead/tr/th[5]//following-sibling::td")
    public List<WebElement> startTimeCells;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/div/div[1]/table/thead/tr/th[6]//following-sibling::td")
    public List<WebElement> stopTimeCells;
    @FindBy(xpath = "//h5")
    public WebElement lessonProgramList;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div/div/table/tbody/tr[1]/td[1]/span[text()='Java']")
    public WebElement sectigiBirinciDers;
    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div[3]/div/div/div/div/table/tbody/tr/td[contains(text(),'Average')]//following-sibling::td")
    public List<WebElement> lessonsList;
    @FindBy(xpath = "(//a[@role='button'])[7]")
    public WebElement gradesAndAnnouncements;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div[1]/div/div/div[1]/table//tr")
    public List<WebElement> studentNoteTable;
    @FindBy(xpath = "(//h5)[2]")
    public WebElement meetListTable;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div[2]/div/div/div/table//tr")
    public List<WebElement> descriptionWebTable;

}
