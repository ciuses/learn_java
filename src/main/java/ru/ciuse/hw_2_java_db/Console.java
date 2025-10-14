package ru.ciuse.hw_2_java_db;

import entity.Gem;
import logic.GemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Configuration
public class Console {

    @Autowired
    public CommandProcessor commandProcessor;

    @Bean
    public CommandLineRunner commandScanner() {
        return args ->
        {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Введите команду. 'exit' для выхода.");
                while (true) {
                    // Показать приглашение для ввода
                    System.out.print("> ");
                    String input = scanner.nextLine();
                    // Выход из цикла, если введена команда "exit"
                    if ("exit".equalsIgnoreCase(input.trim())) {
                        System.out.println("Выход из программы...");
                        break;
                    }
                    // Обработка команды
                    commandProcessor.processCommand(input);
                }
            }
        };
    }

    @Component
    public static class CommandProcessor {

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
}

