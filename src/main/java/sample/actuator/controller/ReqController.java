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

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sample.actuator.model.Request;
import sample.actuator.model.Response;
import sample.actuator.service.GeneralService;
import sample.actuator.utils.MapperJSONUtil;

@Controller
@RequestMapping("api/v1")
@Slf4j
public class ReqController {

	@Autowired
	GeneralService generalService;

	@PostMapping(value = "/cashout")
	@ResponseBody
	public Response response(@RequestBody Request request1) {
		log.info("this req {}",MapperJSONUtil.prettyLog(request1));
		return generalService.general(request1);
	}

}
