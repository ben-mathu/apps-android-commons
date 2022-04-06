package fr.free.nrw.commons.upload.depicts

import fr.free.nrw.commons.upload.models.depictions.DepictedItem
import fr.free.nrw.commons.upload.categories.BaseDelegateAdapter

class UploadDepictsAdapter(onDepictsClicked: (DepictedItem) -> Unit) :
    BaseDelegateAdapter<DepictedItem>(
        uploadDepictsDelegate(onDepictsClicked),
        areItemsTheSame = { oldItem, newItem -> oldItem.id == newItem.id },
        areContentsTheSame = { itemA, itemB -> itemA.isSelected == itemB.isSelected}
    )
