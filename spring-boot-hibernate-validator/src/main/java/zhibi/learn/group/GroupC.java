package zhibi.learn.group;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

/**
 * @author 执笔
 * @date 2018/12/4 11:56
 */
@GroupSequence({Default.class,GroupA.class})
public interface GroupC {
}
