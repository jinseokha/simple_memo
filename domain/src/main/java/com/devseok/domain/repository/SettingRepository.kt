package com.devseok.domain.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.database.DataSnapshot

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-07-13
 * @desc
 */
interface SettingRepository {
    // 앱 최신 버전 체크
    fun checkAppVersion() : Task<DataSnapshot>
}