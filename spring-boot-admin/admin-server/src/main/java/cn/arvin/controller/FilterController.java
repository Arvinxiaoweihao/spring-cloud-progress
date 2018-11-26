package cn.arvin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weihao.xiao
 */
@RestController
public class FilterController {

    @RequestMapping("notifications/filters")
    public void notificationFile() {
        System.out.println("NotificationFilterController.notificationFile ===== =======");
    }

}
