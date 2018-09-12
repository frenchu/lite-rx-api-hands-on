package io.pivotal.literx;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;

/**
 * Learn how to filter Flux elements
 */
public class Part13Filtering {

//========================================================================================

    // TODO Remove users whose names are equal to White
    Flux<User> removeUsersWithWhiteName(Flux<User> flux) {
        return flux.filter(u -> !"White".equals(u.getLastname()));
    }

//========================================================================================

    // TODO Remove duplicated users
    Flux<User> removeDuplicatedUsers(Flux<User> flux) {
        return flux.distinct();
    }

//========================================================================================

    // TODO Remove users with duplicated name
    Flux<User> removeUsersWithDuplicatedNames(Flux<User> flux) {
        return flux.distinct(User::getLastname);
    }

//========================================================================================

    // TODO Remove duplicated users in sequences
    Flux<User> removeDuplicatedUsersInSequences(Flux<User> flux) {
        return flux.distinctUntilChanged();
    }

}
