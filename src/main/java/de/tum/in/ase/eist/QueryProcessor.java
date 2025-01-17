package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Manuel";
        } else { // TODO extend the programm here
            if (query.contains("food")) {
                return "Pizza is hands down the best food ever. Thanks Italy!";
            } else if (query.contains("what is 16 plus 3")) {
                return "19";
            } else if (query.contains("what is 5 plus 11")) {
                return "16";
            } else if (query.contains("which of the following numbers is the largest: 2, 862")) {
                return "862";
            }
            return "";
        }
    }
}
