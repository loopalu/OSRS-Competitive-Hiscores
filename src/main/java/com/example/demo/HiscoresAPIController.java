package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;


@RestController
@RequestMapping("/")
public class HiscoresAPIController {

    @Autowired HistoryService historyService;

    private ArrayList<String> names = new ArrayList<>(Arrays.asList(
            "Y0u Are Y0u",
            "Tankago",
            "H4RF",
            "204 exp left",
            "The God Fate",
            "Cleaning DEF",
            "ToneDef",
            "Moon Trixx",
            "Pusebo"
    ));

    @GetMapping("/")
    public String getHiScores() {
        ArrayList<User> users = new ArrayList<>();
        for (String name: names) {
            users.add(historyService.getUser(name));
        }
        users.sort((User user1, User user2) -> {
            if (user1.getDefence() > user2.getDefence())
                return -1;
            if (user1.getDefence() < user2.getDefence())
                return 1;
            if (user1.getDefenceExp() > user2.getDefenceExp())
                return -1;
            if (user1.getDefenceExp() < user2.getDefenceExp())
                return 1;
            return 0;
        });

        StringBuilder output = new StringBuilder();

        for (int index = 0; index < users.size(); index++) {
            output.append(index + 1).append(". ")
                    .append(users.get(index).getUserName())
                    .append(": lvl: ").append(users.get(index).getDefence())
                    .append(", exp: ").append(users.get(index).getDefenceExp())
                    .append("<br>");
        }

        return output.toString();
    }
}
