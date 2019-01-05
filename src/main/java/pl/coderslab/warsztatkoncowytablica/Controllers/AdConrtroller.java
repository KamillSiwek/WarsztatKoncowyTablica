package pl.coderslab.warsztatkoncowytablica.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.warsztatkoncowytablica.DTO.AdDto;
import pl.coderslab.warsztatkoncowytablica.Services.AdService;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController

public class AdConrtroller {

    private final AdService adService;

    @Autowired
    public AdController(AdService adService) {
        this.adService = adService;
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public Result post(@RequestBody AdDto adDto) {
        return Result.ok(adService.save(adDto));
    }

    @GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Result get(@RequestBody Long id) {
        return Result.ok(adService.find(id));
    }

    @GetMapping(path = "/all", produces = APPLICATION_JSON_VALUE)
    public Result getAll() {
        return Result.ok(adService.getAll());
    }

    @PutMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Result put(@RequestBody AdDto adDto) {
        return Result.ok(adService.update(adDto));
    }

    @DeleteMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Result delete(@PathVariable Long id) {
        return Result.ok(adService.remove(id));
    }
}
