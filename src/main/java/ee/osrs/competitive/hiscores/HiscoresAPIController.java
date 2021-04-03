package ee.osrs.competitive.hiscores;

import ee.osrs.competitive.hiscores.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;


@RestController
@RequestMapping("/")
public class HiscoresAPIController {

    @Autowired
    HistoryService historyService;

    //TODO: make API work with input in JSON format
    private final ArrayList<String> names = new ArrayList<>(Arrays.asList(
            "Y0u Are Y0u",
            "An Optician",
            "204 exp left",
            "The God Fate",
            "Cleaning DEF",
            "ToneDef",
            "Moon Trixx",
            "Pusebo",
            "Def Brif",
            "fl",
            "LeadSpade",
            "Lee Adama",
            "rol u",
            "Using Lamps",
            "Flopsy",
            "Pogxy",
            "Capiz",
            "Surround"
    ));

    //TODO: input should get also the skill name by which the comparision should be done
    @GetMapping("/")
    public String getHiScores() {
        return historyService.getHiScores(names);
    }
}
