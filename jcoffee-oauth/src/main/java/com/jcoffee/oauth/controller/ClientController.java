package com.jcoffee.oauth.controller;

import com.jcoffee.commons.basics.model.Result;
import com.jcoffee.oauth.dto.ClientDto;
import com.jcoffee.oauth.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 角色相关接口
 *
 */
@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private IClientService clientService;

    @GetMapping
    public Result list(@RequestParam Map<String, Object> params) {
        return new Result(clientService.listClent(params, true));
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clientService.delClient(id);
    }

    @PostMapping("/saveOrUpdate")
    public Result saveOrUpdate(@RequestBody ClientDto clientDto) {
        return clientService.saveClient(clientDto);
    }
}
