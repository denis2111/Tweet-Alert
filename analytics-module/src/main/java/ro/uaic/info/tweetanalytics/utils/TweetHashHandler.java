package ro.uaic.info.tweetanalytics.utils;

import org.apache.commons.codec.digest.DigestUtils;
import ro.uaic.info.tweetanalytics.DTOs.TweetDTO;


import java.math.BigInteger;
import java.util.UUID;
import java.util.logging.Logger;

public class TweetHashHandler {
    private static final Logger LOG = Logger.getLogger(TweetHashHandler.class.getName());


    public static String generateHashForTweet(TweetDTO tweet){
        String sha3Hex = new DigestUtils("SHA-256").digestAsHex(tweet.toString());

        LOG.info(tweet.toString());
        LOG.info(sha3Hex);
        return sha3Hex;
    }
}
