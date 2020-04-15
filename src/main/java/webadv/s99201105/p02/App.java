package webadv.s99201105.p02;

import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) {
		String name = "17201319";
		String password = sha256hex("17201319");
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		Io io = new Io();
		io.writer(user);
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        User user1 = io.reader();
		if(user1.getName().equals(args[0]) && user1.getPassword().equals(sha256hex(args[1]))){
			System.out.println("成功");
		}else{
			System.out.println("ERROR");
		}
        //System.out.println(sha256hex(args[0]));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

