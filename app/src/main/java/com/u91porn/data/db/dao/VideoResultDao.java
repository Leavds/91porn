package com.u91porn.data.db.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.u91porn.data.model.VideoResult;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "VIDEO_RESULT".
*/
public class VideoResultDao extends AbstractDao<VideoResult, Long> {

    public static final String TABLENAME = "VIDEO_RESULT";

    /**
     * Properties of entity VideoResult.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property VideoUrl = new Property(1, String.class, "videoUrl", false, "VIDEO_URL");
        public final static Property VideoId = new Property(2, String.class, "videoId", false, "VIDEO_ID");
        public final static Property OwnnerId = new Property(3, String.class, "ownnerId", false, "OWNNER_ID");
        public final static Property ThumbImgUrl = new Property(4, String.class, "thumbImgUrl", false, "THUMB_IMG_URL");
        public final static Property VideoName = new Property(5, String.class, "videoName", false, "VIDEO_NAME");
        public final static Property OwnnerName = new Property(6, String.class, "ownnerName", false, "OWNNER_NAME");
        public final static Property AddDate = new Property(7, String.class, "addDate", false, "ADD_DATE");
        public final static Property UserOtherInfo = new Property(8, String.class, "userOtherInfo", false, "USER_OTHER_INFO");
    }


    public VideoResultDao(DaoConfig config) {
        super(config);
    }
    
    public VideoResultDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"VIDEO_RESULT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"VIDEO_URL\" TEXT," + // 1: videoUrl
                "\"VIDEO_ID\" TEXT," + // 2: videoId
                "\"OWNNER_ID\" TEXT," + // 3: ownnerId
                "\"THUMB_IMG_URL\" TEXT," + // 4: thumbImgUrl
                "\"VIDEO_NAME\" TEXT," + // 5: videoName
                "\"OWNNER_NAME\" TEXT," + // 6: ownnerName
                "\"ADD_DATE\" TEXT," + // 7: addDate
                "\"USER_OTHER_INFO\" TEXT);"); // 8: userOtherInfo
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_VIDEO_RESULT_VIDEO_ID ON \"VIDEO_RESULT\"" +
                " (\"VIDEO_ID\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"VIDEO_RESULT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, VideoResult entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String videoUrl = entity.getVideoUrl();
        if (videoUrl != null) {
            stmt.bindString(2, videoUrl);
        }
 
        String videoId = entity.getVideoId();
        if (videoId != null) {
            stmt.bindString(3, videoId);
        }
 
        String ownnerId = entity.getOwnnerId();
        if (ownnerId != null) {
            stmt.bindString(4, ownnerId);
        }
 
        String thumbImgUrl = entity.getThumbImgUrl();
        if (thumbImgUrl != null) {
            stmt.bindString(5, thumbImgUrl);
        }
 
        String videoName = entity.getVideoName();
        if (videoName != null) {
            stmt.bindString(6, videoName);
        }
 
        String ownnerName = entity.getOwnnerName();
        if (ownnerName != null) {
            stmt.bindString(7, ownnerName);
        }
 
        String addDate = entity.getAddDate();
        if (addDate != null) {
            stmt.bindString(8, addDate);
        }
 
        String userOtherInfo = entity.getUserOtherInfo();
        if (userOtherInfo != null) {
            stmt.bindString(9, userOtherInfo);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, VideoResult entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String videoUrl = entity.getVideoUrl();
        if (videoUrl != null) {
            stmt.bindString(2, videoUrl);
        }
 
        String videoId = entity.getVideoId();
        if (videoId != null) {
            stmt.bindString(3, videoId);
        }
 
        String ownnerId = entity.getOwnnerId();
        if (ownnerId != null) {
            stmt.bindString(4, ownnerId);
        }
 
        String thumbImgUrl = entity.getThumbImgUrl();
        if (thumbImgUrl != null) {
            stmt.bindString(5, thumbImgUrl);
        }
 
        String videoName = entity.getVideoName();
        if (videoName != null) {
            stmt.bindString(6, videoName);
        }
 
        String ownnerName = entity.getOwnnerName();
        if (ownnerName != null) {
            stmt.bindString(7, ownnerName);
        }
 
        String addDate = entity.getAddDate();
        if (addDate != null) {
            stmt.bindString(8, addDate);
        }
 
        String userOtherInfo = entity.getUserOtherInfo();
        if (userOtherInfo != null) {
            stmt.bindString(9, userOtherInfo);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public VideoResult readEntity(Cursor cursor, int offset) {
        VideoResult entity = new VideoResult( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // videoUrl
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // videoId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ownnerId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // thumbImgUrl
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // videoName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // ownnerName
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // addDate
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // userOtherInfo
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, VideoResult entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setVideoUrl(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setVideoId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setOwnnerId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setThumbImgUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setVideoName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setOwnnerName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAddDate(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setUserOtherInfo(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(VideoResult entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(VideoResult entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(VideoResult entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}