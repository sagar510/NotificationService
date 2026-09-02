import channels.MessageSender;

import java.util.List;

public class NotificationService {
    private List<MessageSender> channels;

    NotificationService(List<MessageSender> channels){
        this.channels = channels;
    }

    public void sendAll(){
        channels.forEach(channel -> channel.send("Hey"));
    }
}
