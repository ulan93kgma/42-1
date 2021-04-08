import java.util.HashMap;

public class Dictionary {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String test = "Dear Harry, Ron wrote to me and told me about his phone call to your Uncle Vernon. I do hope you’re all right. I’m on holiday in France at the moment and I didn’t know how I was going to send this to you —what if they’d opened it at customs? —but then Hedwig turned up! I think she wanted to make sure you got something for your birthday for a change. I bought your present by owl-order; there wasan advertisement in the Daily Prophet (I’ve been getting it delivered; it’s so good to keep up with what’s going on in the wizarding world). Did you see that picture of Ron and his family a week ago? I bet he’s learning loads. I’m really jealous —the ancient Egyptian wizards were fascinating. There’s some interesting local history of witchcraft here, too. I’ve rewritten my whole History of Magic essay to include some of the things I’ve found out, I hope it’s not too long —it’s two rolls of parchment more than Professor Binns asked for. Ron says he’s going to be in London in the last week of the holidays. Can you make it? Will your aunt and uncle let you come? I really hope you can. If not, I’ll see you on the Hogwarts Express on September first! Love from Hermione P.S. Ron says Percy’s Head Boy. I’ll bet Percy’s really pleased. Ron doesn’t seem too happy about it";
        char[] chars = test.toCharArray();

        for(int i=0; i<chars.length;i++)
        {
            if(!map.containsKey(chars[i]))
            {
                map.put(chars[i], 1);
            }
            map.put(chars[i], map.get(chars[i])+1);
        }

        System.out.println(map.toString());
    }
}
