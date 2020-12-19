import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class ControllerMain extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "popugayrobot";
    }

    @Override
    public String getBotToken() {
        return "1426546948:AAGVDiNttjdXpWyJVmcEXvz09ICNqO-muFw";
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        Long chatId = update.getMessage().getChatId();
        String text = update.getMessage().getText();
        String firstName = update.getMessage().getFrom().getFirstName();
        String message = "*" + firstName + ":*  \"" + text + "\"  *deb yozdi.*";
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);
        sendMessage.setParseMode(ParseMode.MARKDOWN);
        execute(sendMessage);
        System.out.println(firstName + ": " + text);
    }
}
