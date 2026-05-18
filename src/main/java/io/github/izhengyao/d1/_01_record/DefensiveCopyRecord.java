package io.github.izhengyao.d1._01_record;

import java.util.List;

public record DefensiveCopyRecord(String user,List<String> messages) {
    public DefensiveCopyRecord {
        messages = List.of(messages);
    }
}
