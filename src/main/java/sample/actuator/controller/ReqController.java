/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.actuator.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sample.actuator.model.Request;
import sample.actuator.model.RequestDetails;

@Controller
@RequestMapping("api/v1")
@Slf4j
public class ReqController {

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> hello() {
		Map<String, Object> model = new HashMap<>();
		return model;
	}

	@PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> olleh() {
		Map<String, Object> model = new LinkedHashMap<>();
		return model;
	}

	@PostMapping(value = "/cashout")
	@ResponseBody
	public Request getrequest(@RequestBody Request request1) {
		log.info("this req {}",request1);
		Request request = new Request();
		RequestDetails requestDetails = new RequestDetails();

		requestDetails.setNohp("143124124");
		requestDetails.setToken("asdaas");
		request.setBranchid("qwe");
		request.setKey("asdasd");
		request.setRequestDetails(requestDetails);

		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);

		return request1;

	}

}
