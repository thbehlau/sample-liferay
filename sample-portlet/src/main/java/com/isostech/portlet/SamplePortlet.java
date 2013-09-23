package com.isostech.portlet;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller(value="sample")
@RequestMapping(value="VIEW")
public class SamplePortlet {
	

    @RenderMapping
    public String showForm(RenderRequest request, RenderResponse response) throws Exception {
		return "view";
	}
}
