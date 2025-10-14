package app_interface;
import entity.Gem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import logic.GemServiceImpl;

@Component
public class CommandProcessor {

    private final GemServiceImpl GemServiceImpl;

    @Autowired
    public CommandProcessor(GemServiceImpl GemServiceImpl) {
        this.GemServiceImpl = GemServiceImpl;
    }

    public void processCommand(String input) {
        String[] cmd = input.split(" ");
        switch (cmd[0]) {
            case "create":
                GemServiceImpl.createGem(Long.valueOf(cmd[1]), String.valueOf(cmd[2]), String.valueOf(cmd[3]), Integer.valueOf(cmd[4]));
                System.out.println("Камень успешно добавлен...");
                break;
            case "find":
                Gem gemForUser = GemServiceImpl.findById(Long.valueOf(cmd[1]));
                System.out.println("Ваш камень: " + gemForUser);
                break;
            case "update":
                GemServiceImpl.updatePrice(Long.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
                System.out.println("Цена сменилась");
                break;
            case "delete":
                GemServiceImpl.deleteById(Long.valueOf(cmd[1]));
                System.out.println("Камень удалён...");
                break;
            default:
                System.out.println("Введена неизвестная команда...");
        }
    }
}