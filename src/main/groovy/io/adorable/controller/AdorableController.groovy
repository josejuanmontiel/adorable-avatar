package io.adorable.controller

import io.adorable.service.AdorableService
import io.adorable.service.model.FaceParamView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
public class AdorableController {

    @Autowired
    AdorableService adorableService;

    int color=(Math.floor((255-0)*Math.random()) + 1) as Integer

    @RequestMapping(value="/select", method=RequestMethod.GET)
    public String selectAdorable(Model model) {
        FaceParamView faceParam = adorableService.getTypes();
        model.addAttribute("paramSelected", new ParamSelected())
        model.addAttribute("face",faceParam.getFace());
        return "select"
    }

    @RequestMapping(value="/result", method=RequestMethod.POST)
    public String showAdorable(@ModelAttribute ParamSelected paramSelected, Model model) {
        FaceParamView faceParam = adorableService.getTypes();

        // TODO Parametrizar url
        String url = "http://api.adorable.io/avatars/face/"+paramSelected.eyes+"/"+paramSelected.nose+"/"+paramSelected.mouth+"/"+color

        model.addAttribute("faceselect",url)

        return "result"
    }


}
