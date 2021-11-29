package ip.syssrc.string;

/**
 * URLParser
 *
 * Assignment 5.1
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
public class URLParser {

    /**
     * Encode rawURL into percent-encoding format
     *
     * @param rawURL the URL to be encoded
     * @return string of encoded URL
     */
    public static String encode(String rawURL) {
        String[] Character = { "$", "&", "+", ",", "/", ":", ";", "=", "?", "@", 
        "\"", "<", ">", "#", "%", "{", "}", "\\", "^", "~", "[", "]", "`",};
        String[] urlEncode = { "%24", "%26", "%2b", "%2c", "%2f", "%3a", "3b", 
        "%3b", "%3d", "%3f", "%40", "%20", "%22", "%3c", "%3e", "%23", "%25", 
        "%7b", "%7d", "%5c", "%5e", "%7e", "%5b", "%5d", "%60"};
        int index = 0;

        while (index < Character.length){
            if (rawURL.contains(Character[index])){
                urlEncode[index] = urlEncode[index].toUpperCase();
                rawURL = rawURL.replaceAll(Character[index], urlEncode[index]);
            }
            index++;
        }
        return new String(rawURL);
    }

    /**
     * Decode percent-encoding URL into raw URL
     *
     * @param encodedURL the percent-encoding URL to be decoded
     * @return string of decoded URL
     */
    public static String decode(String encodedURL) {
        String[] Character = { "$", "&", "+", ",", "/", ":", ";", "=", "?", "@", 
        "\"", "<", ">", "#", "%", "{", "}", "\\", "^", "~", "[", "]", "`",};
        String[] urlEncode = { "%24", "%26", "%2b", "%2c", "%2f", "%3a", "3b", 
        "%3b", "%3d", "%3f", "%40", "%20", "%22", "%3c", "%3e", "%23", "%25", 
        "%7b", "%7d", "%5c", "%5e", "%7e", "%5b", "%5d", "%60"};
        int index = 0;
        
        while (index < Character.length){
            if (encodeURL.contains(Character[index])){
                encodedURL = encodedURL.replaceAll(urlEncode[index], Character[index]);
        }
        index++;
        }
        return new String(encodedURL);
    }
}
