package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkPage {

    public TalkPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String conversationName = "TestGroup1";

    @FindBy(xpath = "(//li[@data-id='spreed']/a)[1]")
    public WebElement talkModule_Btn;

    @FindBy(css = "button[aria-label='Create a new group conversation']")
    public WebElement createNewConversation_PlusBtn;

    @FindBy(css = "input[placeholder='Conversation name']")
    public WebElement conversationName_InputBox;

    @FindBy(css = "button[class='navigation__button navigation__button-right primary']")
    public WebElement addParticipants_Btn;

    @FindBy(css = "input[placeholder='Search participants']")
    public WebElement searchParticipants_InputBox;

    @FindBy(xpath = "//div[@class='participants-search-results scrollable']//ul")
    public List<WebElement> userList;

    @FindBy(xpath = "//span[.='Employee1']")
    public WebElement addEmployee1AsParicipant;

    @FindBy(xpath = "//span[.='Employee10']")
    public WebElement addEmployee10AsParicipant;

    @FindBy(xpath = "//button[contains(.,'Create conversation')]")
    public WebElement createConversation_Btn;

    @FindBy(xpath = "//div[.='You created the conversation']")
    public WebElement youCreatedTheConversation_Text;

    @FindBy(css = "a[id='participants']")
    public WebElement participantsTab;

    @FindBy(xpath = "//a[@aria-label='Conversation, TestGroup1']")
    public WebElement conversationTab;

    @FindBy(xpath = "(//span[@class='participant-row__user-name'])[2]")
    public WebElement firstParticipantInParticipantTab;

    @FindBy(xpath = "//div[normalize-space(text())='You removed']")
    public WebElement removeMessage;

    @FindBy(xpath = "(//button[@aria-label='Participant settings'])[1]")
    public WebElement participant3DotsMenu;

    @FindBy(xpath = "//span[.='Remove participant']")
    public WebElement removeParticipantBtn;

    @FindBy(xpath = "(//div[@class='conversation-icon'])[1]")
    public WebElement conversationIcon;

    @FindBy(css = "div[role='textbox']")
    public WebElement messageInputBox;

    @FindBy(xpath = "//div[.='Hello World']")
    public WebElement sentMessage;






}
