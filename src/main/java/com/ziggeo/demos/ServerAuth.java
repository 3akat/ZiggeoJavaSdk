package com.ziggeo.demos;

import org.json.*;
import com.ziggeo.*;

public class ServerAuth {

	public static void main(String[] args) throws Exception {
		Ziggeo ziggeo = new Ziggeo(args[0], args[1], args[2]);
		System.out.println(ziggeo.authtokens().create(new JSONObject("{\"grants\":{\"read\":{\"all\":true}}}")).get("token"));
	}

}
