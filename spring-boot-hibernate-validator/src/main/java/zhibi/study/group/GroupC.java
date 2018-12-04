package zhibi.study.group;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

/**
 * @author Dream笔
 * @date 2018/12/4 11:56
 */
@GroupSequence({Default.class,GroupA.class})
public interface GroupC {
}
