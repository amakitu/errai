package org.jboss.errai.ui.test.nested.client.res;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;

import org.jboss.errai.ui.shared.api.annotations.Insert;
import org.jboss.errai.ui.shared.api.annotations.Replace;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;

@Dependent
@Templated
public class ChildComponent extends Composite {

  @Replace
  private Label c1;

  @Insert("c2")
  private Button content2;
  
  @PostConstruct
  public void init()
  {
    c1.getElement().setAttribute("id","c1a");
    c1.setText("Added by component");
    content2.getElement().setAttribute("id", "c1b");
  }

  public Label getC1() {
    return c1;
  }
  
  public Button getC2() {
    return content2;
  }
  
}