package org.exoplatform.study.juzu;

import juzu.Action;
import juzu.Path;
import juzu.Response;
import juzu.View;
import juzu.template.Template;

import javax.inject.Inject;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/** @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a> */
public class Controller {

  @Inject
  @Path("index.gtmpl")
  Template index;


  @View
  public void index(String name, String team) throws IOException {
	  Map<String, Object> parameters = new HashMap<String, Object>();
	  parameters.put("name", name);
	  parameters.put("team", team);
	  index.render(parameters);
  }
  
  @Action
  public Response add(String name, String team) {
    
    return Controller_.index(name,team);
  }
}
