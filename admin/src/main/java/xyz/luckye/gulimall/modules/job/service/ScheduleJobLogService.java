

package xyz.luckye.gulimall.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.luckye.gulimall.common.utils.PageUtils;
import xyz.luckye.gulimall.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
