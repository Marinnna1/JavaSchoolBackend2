package ru.javaschool.JavaSchoolBackend1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.javaschool.JavaSchoolBackend1.dto.EventDto;
import ru.javaschool.JavaSchoolBackend1.service.EventsService;
import java.io.IOException;
import java.util.List;


@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("events/")
@RequiredArgsConstructor
public class EventsController {

    private final EventsService eventsService;

    @PostMapping("all")
    public List<EventDto> getAll(@RequestBody EventDto eventDto) throws IOException {
        return eventsService.getAll(eventDto.getPageNumber());
    }

    @GetMapping("events_count")
    public Long getEventsCount() throws IOException {
        return eventsService.getEventsCount();
    }
}
