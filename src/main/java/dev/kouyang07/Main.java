package dev.kouyang07;

import dev.kouyang07.Types.Match;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Document doc = Jsoup.parse(Util.getHTML("https://www.tournamentsoftware.com/player/C36A90FE-DFA8-414B-A8B6-F2BCF6B9B8BD/414202/tournaments"));
        Elements matchGroups = doc.getElementsByClass("match-group");
        for(Element matches : matchGroups){
            Elements matchElements = matches.getElementsByClass("match-group__item");
            System.out.println("Matches: " + matchElements.size());
            for(Element matchElement : matchElements){
                String winner = matchElement.getElementsByClass("match__row has-won").getFirst().text();
                String loser = matchElement.getElementsByClass("match__row").getLast().text();
                System.out.println(winner + " defeated " + loser);
            }
        }
    }
}