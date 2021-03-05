package covid;

import covid.businesslogiclayer.ProjectConfig;
import covid.businesslogiclayer.language.Language;
import covid.businesslogiclayer.language.LanguageConfiguration;
import org.flywaydb.core.Flyway;
import java.util.Scanner;
import static covid.presentationlayer.TheMenu.menu;


public class VaccinationMain {


    public static void main(String[] args) {
        ProjectConfig config = new ProjectConfig();
        Scanner scanner = config.getScanner();

        languageSelector(config, scanner);

        try {
            Flyway flyway = Flyway.configure().dataSource(config.getCd().getDataSource()).load();
            flyway.migrate();
        } catch (Exception e){
            throw new IllegalArgumentException(config.getLanguage().getMessage("9"));
        }



        menu(config, scanner);
    }

    private static void languageSelector(ProjectConfig config, Scanner scanner) {
        String language;
        do {
            System.out.println(config.getLanguage().getMessage("select") + config.getLanguage().getMessage("newRow") +
                    config.getLanguage().getMessage("A") + config.getLanguage().getMessage("newRow") +
                    config.getLanguage().getMessage("B"));
            language = scanner.nextLine();
        } while (
                !(config.getLanguageMenu().contains(language.toUpperCase()))
        );


        config.setLanguage(new LanguageConfiguration(Language.valueOf(language.toUpperCase()).getFilename()));
    }
}



