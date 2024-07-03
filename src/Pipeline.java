package com.aparna.nerapplication.core;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class Pipeline {
    private static Properties properties;
    private static String propertiesNames = "tokenize,ssplit,pos,lemma,ner";
    private static StanfordCoreNLP stanfordCoreNLP;

    public Pipeline() {
        properties = new Properties();
        properties.setProperty("annotators", propertiesNames);
    }

    @Bean
    public StanfordCoreNLP stanfordCoreNLP() {
        if (stanfordCoreNLP == null) {
            stanfordCoreNLP = new StanfordCoreNLP(properties);
        }
        return stanfordCoreNLP;
    }
}
